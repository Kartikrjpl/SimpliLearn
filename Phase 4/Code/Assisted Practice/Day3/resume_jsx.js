import React from 'react';
import ReactDom from 'react-dom';

const name =	<h1> Kartik </h1>;
const address = <h3> Jungpura </h3>;
const number = <h3> 8930592661 </h3>;
const city = 	<h3> New Delhi </h3>;

const container =	 React.createElement('div',{}, [name,address,number,city]);

ReactDom.render(container,document.getElementById('root'));

const list1 = <h4>Technologies</h4>
const list2 = <ol><li>Python</li><li>Java</li></ol>;

const container2 =	 React.createElement('div',{}, [list1,list2]);
ReactDom.render(container2,document.getElementById('tech'));