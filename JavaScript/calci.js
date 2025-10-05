<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width,initial-scale=1.0">
  <title>Modern Calculator</title>
  <style>
    body {
      background: linear-gradient(135deg, #7F7FD5, #86A8E7, #91EAE4);
      display: flex;
      justify-content: center;
      align-items: center;
      min-height: 100vh;
      margin: 0;
      font-family: 'Segoe UI', sans-serif;
    }
    .calculator {
      background: #222;
      padding: 2rem 1rem;
      border-radius: 18px;
      box-shadow: 0 6px 24px rgba(0,0,0,0.18);
      max-width: 380px;
      width: 90vw;
    }
    .output {
      background: #272727;
      color: #f8f8f8;
      font-size: 2rem;
      border-radius: 12px;
      margin-bottom: 16px;
      padding: 16px 12px;
      text-align: right;
      min-height: 54px;
      box-shadow: 0 1px 3px rgba(0,0,0,0.15);
      letter-spacing: 1px;
      overflow-x: auto;
    }
    .keys {
      display: grid;
      grid-template-columns: repeat(4, 1fr);
      gap: 12px;
    }
    button {
      background: #393939;
      color: #fff;
      font-size: 1.3rem;
      padding: 18px 0;
      border: none;
      border-radius: 10px;
      cursor: pointer;
      transition: background 0.2s;
      font-weight: 500;
    }
    button:active, button:hover {
      background: #55acee;
      color: #222;
    }
    button.operator {
      background: #10cfc9;
      color: #fff;
      font-weight: bold;
    }
    button.equal {
      background: #3b5998;
      color: #fff;
      grid-column: span 4;
      font-size: 1.5rem;
      border-radius: 10px 10px 10px 10px;
    }

    @media (max-width: 600px) {
      .calculator { padding: 1rem 0.3rem; }
      button { font-size: 1rem; padding: 12px 0; }
      .output { font-size: 1.4rem; padding: 10px 8px; }
    }
  </style>
</head>
<body>
<div class="calculator">
  <div class="output" id="display">0</div>
  <div class="keys">
    <button onclick="press('7')">7</button>
    <button onclick="press('8')">8</button>
    <button onclick="press('9')">9</button>
    <button class="operator" onclick="press('/')">÷</button>
    <button onclick="press('4')">4</button>
    <button onclick="press('5')">5</button>
    <button onclick="press('6')">6</button>
    <button class="operator" onclick="press('*')">×</button>
    <button onclick="press('1')">1</button>
    <button onclick="press('2')">2</button>
    <button onclick="press('3')">3</button>
    <button class="operator" onclick="press('-')">−</button>
    <button onclick="press('0')">0</button>
    <button onclick="press('.')">.</button>
    <button onclick="clearDisplay()">C</button>
    <button class="operator" onclick="press('+')">+</button>
    <button class="equal" onclick="calculate()">=</button>
  </div>
</div>
<script>
  let display = document.getElementById('display');
  let calculation = '';

  function press(key) {
    if (calculation.length >= 22) return; // UI overflow protection
    if (display.textContent === '0' && key !== '.') {
      calculation = key;
    } else {
      calculation += key;
    }
    display.textContent = calculation;
  }

  function calculate() {
    try {
      // Prevent leading zeros, invalid input, etc.
      let result = eval(calculation.replace(/[^-()\d/*+.]/g, ''));
      display.textContent = result !== undefined ? result : 'Error';
      calculation = String(result);
    } catch {
      display.textContent = 'Error';
      calculation = '';
    }
  }

  function clearDisplay() {
    calculation = '';
    display.textContent = '0';
  }
</script>
</body>
</html>
