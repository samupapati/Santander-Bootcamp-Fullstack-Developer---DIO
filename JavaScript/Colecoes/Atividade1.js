
users = new Map();

users.set("Augusto", "user")
    .set("Ricardo", "admin")
    .set("Luiza", "admin")
    .set("Jessica", "mod")
    .set("Roberto", "user")
    .set("Riquelme", "user")

function getAdmins(){
    console.log("Os administradores são:")
    for(let i of users){
        if(i[1] === 'admin'){
            console.log(i[0])
        }
    }
}

getAdmins()