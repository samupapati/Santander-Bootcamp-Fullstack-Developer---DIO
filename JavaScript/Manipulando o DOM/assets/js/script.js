let h1 = document.querySelector('h1');
let button = document.querySelector('button');
let footer = document.querySelector('footer');
let body = document.querySelector('body');

button.addEventListener('click', changeMode)

function changeMode(){
    h1.classList.toggle('dark-mode');
    button.classList.toggle('dark-mode');
    footer.classList.toggle('dark-mode');
    body.classList.toggle('dark-mode');
}