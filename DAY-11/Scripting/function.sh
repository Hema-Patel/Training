add_number() {
    sum=$(( $1 +$2 ))
    echo "sum of $1 and $2 is: $sum"
}
add_number 10 20

check_file() {
    if [ -f "$1" ]; then
        echo "File '$1' exists."
    else
        echo "File '$1' does not exist."
    fi
}
check_file "testfile.txt"

system_info() {
    echo "operating system: $(uname -o)"
    echo "kernel version: $(uname -r)"
    echo "disk usage:"
    df -h | grep '^/dev/'
}
system_info