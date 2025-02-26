async function fetchdata(){
    try{
        const resp=await fetch('https://jsonplaceholder.typicode.com/users')
        const json=await resp.json();
        console.log(json)

    }catch(error)
    {
        console.log('error encountered',error);
    }
}
fetchdata()