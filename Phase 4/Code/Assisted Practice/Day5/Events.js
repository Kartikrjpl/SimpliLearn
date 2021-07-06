
import React from 'react';
import ReactDOM from 'react-dom';

class Event extends React.Component{
    click(){
        alert("Good One");
    }
    render(){
        return(
            <button onClick = {this.click}> on Click </button>
        );
    }
}

ReactDOM.render(<Event/>, document.getElementById('root'));




import React from 'react';
import ReactDOM from 'react-dom';
class Event extends React.Component {
  constructor() {
     super()
     this.state = {
       count: 0
       
     }
   }
 getCount() {
 
  this.setState({count: this.state.count + 1})
   
   

 }
 render() {
   return ( <div>
                   <button onClick={this.getCount.bind(this)}>Click me | {this.state.count}</button>
               </div>);
 }
}

ReactDOM.render(
 <Event  />,
 document.getElementById('root')
);