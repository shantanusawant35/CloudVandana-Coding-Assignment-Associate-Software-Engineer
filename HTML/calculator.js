let display = document.getElementById("display");
let equation = "";

function appendToDisplay(value) {
  equation += value;
  display.textContent = equation;
}

function clearDisplay() {
  equation = "";
  display.textContent = "";
}

function calculateResult() {
  try {
    equation = eval(equation);
    display.textContent = equation;
  } catch (error) {
    display.textContent = "Error";
  }
}
