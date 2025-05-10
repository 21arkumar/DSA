console.log("starting...");


function login(cb, email, password) {
    setTimeout(() => {
        cb({email: email, isLoggendIn: true});
    }, 1000);
}


function task1(cb, email){
    setTimeout(() => {
        cb({email: email, task1: true});
    }, 2000);
}


function task2(cb){
    setTimeout(() => {
        cb({email: "email", task2: true});
    }, 2000);
}


login((userData) => {
    console.log(userData);
        task1((task1Data)=>{
            console.log(task1Data)
            task2((task2Data)=>{
                console.log(task2Data);
            })
        }, userData.email);
}, "aryan@gmail.com", "12432")

console.log("ending...");


const myPromise = new Promise((res, rej) => {
    const data = "hello";
    if(data){
        res(data)
    }else{
        rej("Data is not present ...Got some error!");
    }
})