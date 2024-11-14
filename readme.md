# eternity calculator ✖️
eternity is a scientific calculator designed to compute various transcendental functions, integrating principles of design thinking, agile methodologies, and devops. 

## features 👾
- **minimalistic ui**: a clean and intuitive interface that reduces distractions, allowing users to focus on their calculations effortlessly.
- **transcendental buttons**: access advanced functions like `arccos(x)`, `sinh(x)`, `standard deviation`, and more for complex mathematical operations beyond basic arithmetic.
- **digit buttons**: easy-to-use buttons for numbers `0 - 9`, along with `+/-` for sign changes, `.` for decimal input, and a `,` (comma) for calculating complex mathematical operations that require multiple inputs.
- **operator buttons**: essential buttons for arithmetic operations `(+, -, x, /, %)` and functions like `sqrt` (square root), `1/x`, and a `=` to display calculated values.
- **special buttons**: features like `c` (clear), `ce` (clear entry), and `back` (delete last input) to help manage calculations efficiently.
- **radio buttons**: options to switch between degree and radian modes for trigonometric calculations, ensuring flexibility in usage.

## the process ✍🏽

## how to use ❓
- **deviation functions:**
  - st.dev(standard deviation), mad (mean absolute deviation)

- **power functions:** 
  - x^y, (ab)^x

- **trigonometric function:**
  - toggle between radian or degree mode first using the radio buttons,
  - enter the number you want to calculate using the digit buttons `0 - 9` (the number must be between -1 and 1),
  - click `arccos(x)` for the result.
  - ```
    example: 0.5 -> arccos(x)
    result: 60° (if in degree mode) or 1.0472 (if in radian mode).
    ```
  
- **logarithm functions:**
  - to calculate the logarithm with base 10:
    - enter the desired number using the digit buttons `0 - 9`,
    - click `log_b(x)` to obtain the result.
    
  - to use euler’s number (e) as the base:
    - input the number using the digit buttons `0 - 9`,
    - click `ln(x)` for the result.
    
  - for logarithms with a base other than 10 or e:
    - enter the number you want to calculate using the digit buttons `0 - 9`,
    - use a `,` (comma) to separate the arguments,
    - follow with the base number using the digit buttons `0 - 9`,
    - the display should show it as `x,b`, where `x` is the argument and `b` is the base,
    - click `log_b(x)` to obtain the result.

- **hyperbolic function:** 
  - sinh(x)

## running the project 🏁
to get the project up and running on your local machine, follow these steps:

- **ensure jdk is installed:** must have the [latest jdk](https://www.java.com/en/download/manual.jsp) installed.
- **clone the repository:**
```bash
git clone https://github.com/barbaraeguche/comp354-eternity.git
```
- **navigate to the project directory:**
```bash
cd comp354-eternity
```
- **run the project:**
```bash
javac CalculatorDriver.java
java CalculatorDriver
```

## gallery 📸
<details>
  <summary>showcase</summary> <br>

  - **initial** <br>
  ![eternity](https://github.com/user-attachments/assets/f3abf9ca-05f2-4130-9fd4-b04838a050ee)
</details>

## video 📸
<details>
  <summary>showcase</summary>
  
  - **x^y**
  
  - **logarithm**
  
  - **arccos(x)**
  
  - **standard deviation**
  
</details>
