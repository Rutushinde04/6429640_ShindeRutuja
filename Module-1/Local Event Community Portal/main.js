// Log and welcome alert
console.log("Welcome to the Community Portal");
window.onload = () => {
  alert("Page fully loaded!");
  loadPreferences();
};

// Event Cards rendering (dummy data)
const events = [
  { name: "Yoga Class", date: "2025-06-15", seats: 20, category: "health" },
  { name: "Music Concert", date: "2025-06-20", seats: 0, category: "music" },
  { name: "Tech Meetup", date: "2025-06-10", seats: 15, category: "tech" }
];

function displayEvents() {
  const eventList = document.getElementById("eventList");
  eventList.innerHTML = "";
  events.forEach(event => {
    const dateCheck = new Date(event.date) > new Date();
    const available = event.seats > 0;
    if (dateCheck && available) {
      const div = document.createElement("div");
      div.className = "eventCard highlight";
      div.innerHTML = `<h3>${event.name}</h3><p>Date: ${event.date}</p><p>Seats: ${event.seats}</p>`;
      eventList.appendChild(div);
    }
  });
}

// Validate phone number on blur
function validatePhone() {
  const phone = document.getElementById("phone").value;
  if (!/^\d{10}$/.test(phone)) alert("Enter a valid 10-digit phone number.");
}

// Submit form with confirmation
function submitForm(e) {
  e.preventDefault();
  document.getElementById("confirmation").textContent = "Registration submitted!";
  savePreferences();
}

// Video can play
function showVideoMsg() {
  document.getElementById("videoMsg").textContent = "Video ready to play";
}

// Character count in message
function countChars(e) {
  console.log("Characters typed:", e.target.value.length);
}

// Geolocation logic
function findNearbyEvents() {
  if (navigator.geolocation) {
    navigator.geolocation.getCurrentPosition(
      pos => {
        document.getElementById("location").textContent = `Lat: ${pos.coords.latitude}, Lon: ${pos.coords.longitude}`;
      },
      err => {
        document.getElementById("location").textContent = "Location access denied or unavailable.";
      },
      { enableHighAccuracy: true, timeout: 5000 }
    );
  } else {
    alert("Geolocation not supported");
  }
}

// LocalStorage preferences
function savePreferences() {
  const type = document.getElementById("eventType").value;
  localStorage.setItem("preferredEvent", type);
}

function loadPreferences() {
  const pref = localStorage.getItem("preferredEvent");
  if (pref) document.getElementById("eventType").value = pref;
}

function clearPrefs() {
  localStorage.clear();
  sessionStorage.clear();
  alert("Preferences cleared");
}

displayEvents();
