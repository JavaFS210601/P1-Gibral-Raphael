const url = 'http://localhost:8080/P1-Gibral-Raphael/'

document.getElementById('getMngButton').addEventListener('click', mngFunc);


async function mngFunc() {
    let response = await fetch(url + 'manager', {credentials: 'include'});

    if(response.status === 200){
        console.log(response);

        let data = await response.json();

        for(let mng of data) {
            console.log(mng);

            let row = document.createElement("tr");

            let cell1 = document.createElement("td");
            let cell2 = document.createElement("td");
            let cell3 = document.createElement("td");
            let cell4 = document.createElement("td");
            let cell5 = document.createElement("td");
            let cell6 = document.createElement("td");
            let cell7 = document.createElement("td");
            let cell8 = document.createElement("td");
            let cell9 = document.createElement("td");

            //build dropdown list

            // var values = ["Pending", "Approved", "Denied"];
 
            // var select = document.createElement("select");
            // select.name = "currentStatus";
            // select.id = "currentStatus" + mng.id;
         
            // for (const val of values)
            // {
            //     var option = document.createElement("option");
            //     option.value = val;
            //     option.text = val.charAt(0) + val.slice(1);
            //     if(val == mng.status.status){
            //         option.selected = val
            //     }
            //     select.appendChild(option);
            // }

            cell1.innerHTML = mng.id;
            cell2.innerHTML = mng.amount;
            cell3.innerHTML = mng.submitted;
            cell4.innerHTML = mng.resolved;
            cell5.innerHTML = mng.description;
            if(mng.author != null){
                cell6.innerHTML = mng.author.first_name;
            }
            if(mng.resolver != null){
                cell7.innerHTML = mng.resolver.first_name;
            }
            // cell6.innerHTML = mng.author.first_name;
            // cell7.innerHTML = mng.resolver.first_name;
            cell8.innerHTML = mng.status.status;
            cell9.innerHTML = mng.type.type;


            row.appendChild(cell1);
            row.appendChild(cell2);
            row.appendChild(cell3);
            row.appendChild(cell4);
            row.appendChild(cell5);
            row.appendChild(cell6);
            row.appendChild(cell7);
            row.appendChild(cell8);
            row.appendChild(cell9);

            document.getElementById('mngBody').appendChild(row);


        }
    }
}

document.getElementById('statusButton').addEventListener('click', statusChangeFunc);


async function statusChangeFunc() {
    console.log("changed===========")
    let reimbi= document.getElementById("reimb_id").value;
    let reimbs = document.getElementById("reimb_status").value;
    let si = 1;
    if (reimbs == "Approved"){
        si = 2; 
    } 
    if (reimbs == "Denied"){
        si = 3;
    } 
    if (reimbs == "Pending"){
        si = 1;
    } 

    let user = {

        id:reimbi,
        status:{status_id:si,status:reimbs}
    }

    let response = await fetch(url + "updatereimb", {
        method: "POST",
        body:JSON.stringify(user),
        credentials: 'include'
    })
    
    if(response.status === 200) {
   
        window.location.href = "./Manager.html";
     
        
       
        //document.getElementById("login-row").innerText="Welcome!";
    } else {
        document.getElementById("status-row").innerText="It doesnt work";
    }
}

document.getElementById('getPendingButton').addEventListener('click', pendingFunc);


async function pendingFunc() {
    let response = await fetch(url + 'pendingreimb', {credentials: 'include'});

    if(response.status === 200){
        console.log(response);

        let data = await response.json();

        for(let pend of data) {
            console.log(pend);

            let row = document.createElement("tr");

            let cell1 = document.createElement("td");
            let cell2 = document.createElement("td");
            let cell3 = document.createElement("td");
            let cell4 = document.createElement("td");
            let cell5 = document.createElement("td");
            let cell6 = document.createElement("td");
            let cell7 = document.createElement("td");
            let cell8 = document.createElement("td");
            let cell9 = document.createElement("td");


            cell1.innerHTML = pend.id;
            cell2.innerHTML = pend.amount;
            cell3.innerHTML = pend.submitted;
            cell4.innerHTML = pend.resolved;
            cell5.innerHTML = pend.description;
            if(pend.author != null){
                cell6.innerHTML = pend.author.first_name;
            }
            if(pend.resolver != null){
                cell7.innerHTML = pend.resolver.first_name;
            }
            // cell6.innerHTML = pend.author.first_name;
            // cell7.innerHTML = pend.resolver.first_name;
            cell8.innerHTML = pend.status.status;
            cell9.innerHTML = pend.type.type;


            row.appendChild(cell1);
            row.appendChild(cell2);
            row.appendChild(cell3);
            row.appendChild(cell4);
            row.appendChild(cell5);
            row.appendChild(cell6);
            row.appendChild(cell7);
            row.appendChild(cell8);
            row.appendChild(cell9);

            document.getElementById('mngBody').appendChild(row);


        }
    }
}


