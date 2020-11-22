let problemNumber = 1;
let problemCount = 10;
let score = 0;
let correctChoice = 0;
let operation = '*';
function getRandomNumber(max) {
    return Math.floor(Math.random() * Math.floor(max));
}
function makeProblem(operation){
    let a=getRandomNumber(10);
    let b=getRandomNumber(10);
    let answer=-1;
    if(operation=='*'){answer=a*b;}
    else if(operation=='/'){answer=a/b;}
    else if(operation=='+'){answer=a+b;}
    else if(operation=='-'){answer=a-b;}
    return [a,b,answer];
}
function chooseAnswer(li){
    let lis=document.querySelector('ul').children;
    for(i=0; i<4; i++){
        if(lis[i]===li){
            if(i==correctChoice){
                score++;
            }
            problemNumber++;
            if(problemNumber<=problemCount){
                updateProblem();
            }else{
                finish();
            }
        }
    }
}
function updateProblem(){
    let problem = makeProblem(operation);
    let answer = problem[2];
    let answers=[-1,-1,-1,-1];
    for(i=0; i<4; i++){
        let fakeAnswer = answer;
        while(fakeAnswer == answer || answers.includes(fakeAnswer)){
            fakeAnswer = getRandomNumber(82);
        }
        answers[i]=fakeAnswer;
    }
    correctChoice = getRandomNumber(4);
    answers[correctChoice] = answer;

    let problemText = problem[0]+' '+operation+' '+problem[1];
    document.getElementsByClassName('expression')[0].innerText=problemText;
    let lis=document.querySelectorAll('li');
    for(i=0; i<4; i++){
        lis[i].innerText=answers[i];
    }
    document.getElementsByClassName('currentProblem')[0].innerText=problemNumber;
    document.getElementsByClassName('currentScore')[0].innerText=score;
}
From Peter Marchetti to Me:  (Privately) 11:21 AM
function setup(){
    score = 0;
    problemNumber = 0;
    let hidden=document.getElementsByClassName('hidden');
    while(hidden.length>0){
        hidden[0].classList.remove('hidden');
    }
    updateProblem();
}
function finish(){
    let hidden=document.getElementsByClassName('show-hide');
    for(i=0;i<hidden.length;i++){
        hidden[i].classList.add('hidden');
    }
}
function initEvents(){
    document.getElementById('btnStartOver').addEventListener('click',setup);
    let lis = document.querySelectorAll('li');
    lis.forEach((li)=>{
        li.addEventListener('click',function(){chooseAnswer(this);})});
    setup();
}
document.addEventListener("DOMContentLoaded",initEvents);
