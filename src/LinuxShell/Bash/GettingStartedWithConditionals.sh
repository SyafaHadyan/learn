read input
if [[ ${input^^} = Y ]]
then
    echo "YES"
elif [[ ${input^^} = N ]]
then
    echo "NO"
fi