read firstNumber
read secondNumber
if [[ $firstNumber > $secondNumber ]]
then
    echo "X is greater than Y"
elif [[ $firstNumber = $secondNumber ]]
then
    echo "X is equal to Y"
elif [[ $firstNumber < $secondNumber ]]
then
    echo "X is less than Y"
fi