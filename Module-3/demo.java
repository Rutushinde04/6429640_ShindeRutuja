public void transferMoney(Connection conn, int fromAccount, int toAccount, double amount) throws SQLException {
    try {
        conn.setAutoCommit(false);

        String debitSQL = "UPDATE accounts SET balance = balance - ? WHERE id = ?";
        String creditSQL = "UPDATE accounts SET balance = balance + ? WHERE id = ?";

        try (PreparedStatement debitStmt = conn.prepareStatement(debitSQL);
             PreparedStatement creditStmt = conn.prepareStatement(creditSQL)) {

            debitStmt.setDouble(1, amount);
            debitStmt.setInt(2, fromAccount);
            debitStmt.executeUpdate();

            creditStmt.setDouble(1, amount);
            creditStmt.setInt(2, toAccount);
            creditStmt.executeUpdate();

            conn.commit();
        }
    } catch (SQLException e) {
        conn.rollback();
        throw e;
    } finally {
        conn.setAutoCommit(true);
    }
}

