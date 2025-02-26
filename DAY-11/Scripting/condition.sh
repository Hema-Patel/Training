echo "Enter the num"
read num
if [ $num -gt 10 ]; then
echo "Number is greater than 10"
else
echo "number is smaller than 10"
fi
echo "enter your age"
read age
echo "are you Indian"
read citizen
if [ $age -ge 18 ] && [ $citizen == "yes" ] || [ $citizen == "YES" ]; then
    echo "you are eligible for vote"
else
    echo "you are not eligible to vote"
fi
