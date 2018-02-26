"use strict";

var a = 1;
var b = 1.1;
var c = true;
var d = "abcdefg";
var e = {
    name: "Klinkhammer",
    vorname: "Kevin"
};
var f = [1, 2, 3];
var g = ["a", 1, e];
var h = function(a, b){console.log(a + b)};

console.log(typeof a);
console.log(typeof b);
console.log(typeof c);
console.log(typeof d);
console.log(typeof e);
console.log(typeof f);
console.log(typeof g);
console.log(typeof h);

var farben = ["blau", "rot"];
farben[2]="grün";
console.log(farben[0]+farben[1]+farben[2]);
farben.sort();

var sum = f.reduce(function(x,y) {return x+y*y;}, 0);
console.log(sum);

for(var key in e) {
    console.log(e[key]);
}

var i = new Date();
var j = new Object();





//################################## Start Stack-Aufgabe###########
var myStack = {
    stack: [],
    push: function (a) {
        this.stack.push(a);
    },
    pop: function () {
        this.stack.pop();
    }
};
var test = new Object();
myStack.push(test);
var test2 = new Object();
myStack.push(test);
console.log(myStack.stack);
myStack.pop();
console.log(myStack.stack);


//################################## Objekt-Hirachien###########
function Shape(x, y) { //Konstruktor Shape
    this.x =x;
    this.y =y;
}
Shape.prototype.area = function(){    //Area Funktion für alle
    var wert =0;
    for(var key in this) {
        //console.log(typeof this[key]);
        if(typeof this[key] === "number")
            wert=wert+this[key];
    }
    return wert
};

function Rectangle(ecken){  //Konstruktor Viereck
    this.ecken = ecken;
}
Rectangle.prototype = new Shape(1, 2);  // Viereck ist ein Shape
Rectangle.prototype.draw = function(){ //Draw funktion Viereck
    console.log("Rectangle: x="+this.x+" y="+this.y+" radius="+this.ecken);
};
var viereck = new Rectangle(4);             //Testing
viereck.draw();
console.log("Area: "+viereck.area());

function Circle(radius){ //Konstruktor Kreis
    this.radius = radius;
}
Circle.prototype = new Shape(2, 3); //Kreis ist ein Shape
Circle.prototype.draw = function(){ //Kreis draw funktion
    console.log("Circle: x="+this.x+" y="+this.y+" radius="+this.radius);
};
var kreis = new Circle(5);     //Testing
kreis.draw();
console.log("Area: "+kreis.area());

viereck.toJSON = function(key) {  //to JSON für viereck
    var other = {x: this.x, y: this.y, ecken: this.ecken};
    return other;
}
var viereckJSON = JSON.stringify(viereck);

kreis.toJSON = function(key) {   //to JSON für kreis
    var other = {x: this.x, y: this.y, radius: this.radius};
    return other;
}
var kreisJSON = JSON.stringify(kreis);

console.log(viereckJSON);  //testing
console.log(kreisJSON);



/*
Die Unterschiede:
In Java (OO Programmiersprache) gibt es Klassen die vererbt werden können.
In JavaScript gibt es keine Klassen - dafür gibt es Konstruktorfunktionen und Prototypen die eine Vererbung ermöglichen.

Ein Vorteil durch die Nutzung von Prototypen ist:
- Beim erstellen von Objekten werden die Methoden nur ein mal erzeugt und nicht für jedes Objekt, wie es beim normalen Konstruktor der fall wäre.

Nachteil:
- Methoden und Eigenschaften müssen stück für stück hinzugefügt werden
- Schnell sehr Unübersichtlich
 */