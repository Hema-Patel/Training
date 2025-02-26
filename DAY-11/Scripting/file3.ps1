$name=Read-Host "enter your name:"
Write-Host "hello $name"

$names = @("alice","bob","catty")
$names | ForEach-Object {Write-Host"Hello,$_"}