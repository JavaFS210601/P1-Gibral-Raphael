const url = 'http://localhost:8080/P1Demo/'

document.getElementById('getAvengerButton').addEventListener('click', assembleFunc);


async function assembleFunc() {
    let response = await fetch(url + 'avengers', {credentials: 'include'});

    if(response.status === 200){
        console.log(response);

        let data = await response.json();

        for(let avenger of data) {
            console.log(avenger);


            let row = document.createElement("tr");

            let cell1 = document.createElement("td");
            let cell2 = document.createElement("td");
            let cell3 = document.createElement("td");
            let cell4 = document.createElement("td");
            let cell5 = document.createElement("td");
            let cell6 = document.createElement("td");
            let cell7 = document.createElement("td");

            cell1.innerHTML = avenger.av_id;
            cell2.innerHTML = avenger.av_name;
            cell3.innerHTML = avenger.av_power;
            cell4.innerHTML = avenger.first_name;
            cell5.innerHTML = avenger.last_name;
            cell6.innerHTML = avenger.power_level;
            cell7.innerHTML = avenger.home_fk.home_name;

            row.appendChild(cell1);
            row.appendChild(cell2);
            row.appendChild(cell3);
            row.appendChild(cell4);
            row.appendChild(cell5);
            row.appendChild(cell6);
            row.appendChild(cell7);
        
            document.getElementById('avengerBody').appendChild(row);


        }
    }
}

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
        document.getElementById("login-row").innerText="Welcome!";
    } else {
        document.getElementById("login-row").innerText="It doesnt work";
    }
}