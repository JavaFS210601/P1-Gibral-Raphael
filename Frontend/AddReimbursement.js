const url = 'http://localhost:8080/P1-Gibral-Raphael/'

document.getElementById("addReimbButton").addEventListener('click', addReimbFunc);

async function addReimbFunc() {

    let amt = document.getElementById("amount").value;
    let desc = document.getElementById("description").value;
    let typ = document.getElementById("type").value;


    let reimb = {

        amount:amt,
        submitted:"07-20-2021",
        resolved:null,
        description:desc,
        receipt:null,
        author: null,
        resolver:null,
        status: "Pending",
        type:typ
    }
    console.log(reimb)

    let response = await fetch(url + "addreimb", {
        method: "POST",
        body:JSON.stringify(reimb),
        credentials: 'include'
    })
    
    if(response.status === 200) {
        window.location.href = "./Employee.html" ;
       
        //document.getElementById("login-row").innerText="Welcome!";
    } else {
        document.getElementById("login-row").innerText="It doesnt work";
    }
}