function showMessage(text) {
  const box = document.getElementById("messageBox");
  box.textContent = text;
  box.classList.remove("hidden");
}
