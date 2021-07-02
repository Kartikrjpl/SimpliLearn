import React from "react";
import ReactDOM from "react-dom";

const myList = ['Kartik','Rajpal']
const listitem = myList.map((ml) => {
    return <li>{ml}</li>
});

ReactDOM.render(<ul>{listitem}</ul>,document.getElementById('root'))

// ----------------------------------


function NameList(props){
 const myList = props.myList;
 const listItem = myList.map((mL) => 
 <li>{ml}</li>
 );

 return(
     <div>
         <h2>
             List is
         </h2>
         <ul>
             {listItem}
         </ul>
     </div>
 );


}

const myList = ['Kartik','Rajpal']

ReactDOM.render(<NameList myList={myList}/>,document.getElementById('root'))
