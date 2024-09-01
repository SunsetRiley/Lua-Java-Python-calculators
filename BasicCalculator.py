def main():
    print("Welcome to [Your Name]'s Calculator")
    
    # Get the first number
    num1 = float(input("Please enter the first number: "))
    print(f"You entered {num1}")
    
    # Get the second number
    num2 = float(input("Please enter the second number: "))
    print(f"You entered {num2}")
    
    # Get the operator
    operator = input("Please enter the operator (+, -, *, /): ")
    print(f"Calculating {num1} {operator} {num2}...")
    
    # Perform the calculation
    if operator == '+':
        result = num1 + num2
    elif operator == '-':
        result = num1 - num2
    elif operator == '*':
        result = num1 * num2
    elif operator == '/':
        if num2 != 0:
            result = num1 / num2
        else:
            print("Error: Division by zero is not allowed.")
            return
    else:
        print(f"Error: {operator} is not a valid operator. Please enter +, -, *, or /")
        return
    
    # Print the result
    print(result)
    print("Made by @SunsetRiley5")

if __name__ == "__main__":
    main()
