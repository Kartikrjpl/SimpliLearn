import React from 'react';
import ReactDom from 'react-dom';

const name =	React.createElement('h1',{},'Kartik');
const address = 	React.createElement('h3',{},'Jungpura');
const number =	React.createElement('h3',{},'+91-8930592661');
const city = 	React.createElement('h3',{},'New Delhi');

const container =	 React.createElement('div',{}, [name,address,number,city]);

ReactDom.render(container,document.getElementById('root'));

const list2 = React.createElement('div',{},
	React.createElement('h4',{},'Technologies'),
	React.createElement('ol',{},
	[React.createElement('li',{},'Python'),
	React.createElement('li',{},'Java'),
	React.createElement('li',{},'React'),
	React.createElement('li',{},'DBMS')]
	
	),
	);

ReactDom.render(list2,document.getElementById('tech'))
	
const list3 = React.createElement('div',{},
	React.createElement('h4',{},'Hobbies'),
	React.createElement('ol',{},
	[React.createElement('li',{},'Cook'),
	React.createElement('li',{},'Travell')
	
])
	);

ReactDom.render(list3,document.getElementById('hobbies'));
	
