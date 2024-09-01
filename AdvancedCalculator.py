import math

def main():
    print("Welcome to [Your Name]'s Advanced Python Calculator")
    
    # Get the first number
    num1 = float(input("Please enter the first number: "))
    print(f"You entered {num1}")
    
    # Get the second number
    num2 = float(input("Please enter the second number: "))
    print(f"You entered {num2}")
    
    # Get the operator
    operator = input("Please enter the operator (+, -, *, /, ^, V for square root, or %): ")
    print(f"Calculating {num1} {operator} {num2}...")
    
    # Check for invalid operations
    if num1 < 0 and (operator == 'V' or operator == 'v'):
        print("Error: The number being used to square root is negative, which is not allowed.")
        return
    
    if num2 == 0 and operator == '/':
        print("Cannot divide by 0")
        return
    
    # Perform the calculation
    if operator == '+':
        result = num1 + num2
    elif operator == '-':
        result = num1 - num2
    elif operator == '*':
        result = num1 * num2
    elif operator == '/':
        result = num1 / num2
    elif operator == '^':
        result = math.pow(num1, num2)
    elif operator == 'V' or operator == 'v':
        result = math.sqrt(num1)
    elif operator == '%':
        result = (num1 * num2) / 100
    else:
        print(f"Error: {operator} is not a valid operator. Please enter +, -, *, /, ^, or V.")
        return
    
    # Print the result
    print(f"Final result: {result}")
    print("Made by @SunsetRiley5")

if __name__ == "__main__":
    main()
