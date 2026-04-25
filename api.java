let url="https://dog.ceo/api/breeds/image/random";

async function randomPic(){
    try{
        let data=await axios.get(url);
        return data.data.message;
    }catch(err){
        console.log(err);
        return "Picture not found";
    }
}

let button=document.querySelector("button");

button.addEventListener("click",async()=>{
    let img=document.querySelector("img");
    let link=await randomPic();
    img.setAttribute("src",link);
})
