local num1
local num2
local operator
local result

print("Welcome to [Your Name]'s Lua calculator")
print("Please enter the first number of your choice.")
num1 = tonumber(io.read())
print("You entered: ", num1)
print("Please enter the 2nd number of your choice.")
num2 = tonumber(io.read())
print("You entered: ", num2)
print("Please enter the operator. Options are: +, -, *, or /.")
operator = io.read()

if operator == "/" and num2 == 0 then
    print("Cannot divide by 0.")
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
    else
        print("Error: ", operator, " is not a real operator. Please enter +, -, *, or /.")
        return
end
print(num1 , operator, num2, "=", result)