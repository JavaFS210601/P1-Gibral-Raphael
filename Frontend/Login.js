const url = 'http://localhost:8080/P1-Gibral-Raphael/'

document.getElementById("loginButton").addEventListener('click', loginFunc);

async function loginFunc() {

    let usern = document.getElementById("username").value;
    let userp = document.getElementById("password").value;

    let user = {

        username:usern,
        password:userp
    }

    let response = await fetch(url + "login", {
        method: "POST",
        body:JSON.stringify(user),
        credentials: 'include'
    })
    
    if(response.status === 200) {
        let data = await response.json();
        if (data.role.id === 1){
            window.location.href = "./Employee.html?employee=" + data.id ;
        }else{
            window.location.href = "./Manager.html?manager=" + data.id;
        }
        
       
        //document.getElementById("login-row").innerText="Welcome!";
    } else {
        document.getElementById("login-row").innerText="It doesnt work";
    }
}