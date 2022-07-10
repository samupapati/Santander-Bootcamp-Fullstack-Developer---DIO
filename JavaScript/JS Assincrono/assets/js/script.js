const BASE_URL = 'https://thatcopy.pw/catapi/rest/';
const catBtn = document.querySelector('#change-cat')
const catImg = document.querySelector('#cat')
const getCats = async () => {
    const data = await fetch(BASE_URL)
        .then((res) => res.json())
        .catch((e) => console.log(e));
    
        return data.webpurl;
}

const loadImg = async () => {
    catImg.src = await getCats();
}

catBtn.addEventListener('click', loadImg);

loadImg();