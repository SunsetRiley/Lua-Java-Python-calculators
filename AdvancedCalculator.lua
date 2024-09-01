local num1
local num2
local operator
local result

print("Welcome to [Your Name]'s Advanced Lua Calculator")
print("Please enter the first number of your choice.")
num1 = tonumber(io.read())
print("You entered: ", num1)
print("Please enter the second number of your choice.")
num2 = tonumber(io.read())
print("You entered: ", num2)
print("Please enter the operator. Options are: +, -, *, /, ^, V (For square root) or % of.")
print("Note: If you select square root, the first number will be square rooted.")
operator = io.read()

if operator == "/" and num2 == 0 then
    print("Cannot divide by 0.")
    return
end

if (operator == "V" or operator == "v") and num1 < 0 then
    print("Error: The number being used to square root is negative, which is not allowed.")
    return
end

if operator == "+" then
    result = num1 + num2
elseif operator == "-" then
    result = num1 - num2
elseif operator == "*" then
    result = num1 * num2
elseif operator == "/" then
    result = num1 / num2
elseif operator == "^" then
    result = num1 ^ num2
elseif operator == "V" or operator == "v" then
    result = math.sqrt(num1)
elseif operator == "%" then
    result = (num1 / 100) * num2
    print(num1, "is worth about", result, num2)
    return
else
    print("Error:", operator, "is NOT a valid operator.")
    return
end

print(num1, operator, num2, "=", result)