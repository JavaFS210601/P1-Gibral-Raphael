const url = 'http://localhost:8080/P1-Gibral-Raphael/'

document.getElementById('getempButton').addEventListener('click', currentFunc);


async function currentFunc() {
    let response = await fetch(url + 'employee', {credentials: 'include'});

    if(response.status === 200){
        console.log(response);

        let data = await response.json();

        for(let reimb of data) {
            console.log(reimb);


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

            cell1.innerHTML = reimb.id;
            cell2.innerHTML = reimb.amount;
            cell3.innerHTML = reimb.submitted;
            cell4.innerHTML = reimb.resolved;
            cell5.innerHTML = reimb.description;
            if(reimb.author != null){
                cell6.innerHTML = reimb.author.first_name;
            }
            if(reimb.resolver != null){
                cell7.innerHTML = reimb.resolver.first_name;
            }
            if(reimb.status != null){
                cell8.innerHTML = reimb.status.status;
            }
            if(reimb.type != null){
                cell9.innerHTML = reimb.type.type;
            }

            row.appendChild(cell1);
            row.appendChild(cell2);
            row.appendChild(cell3);
            row.appendChild(cell4);
            row.appendChild(cell5);
            row.appendChild(cell6);
            row.appendChild(cell7);
            row.appendChild(cell8);
            row.appendChild(cell9);
        
            document.getElementById('empBody').appendChild(row);


        }
    }
}

