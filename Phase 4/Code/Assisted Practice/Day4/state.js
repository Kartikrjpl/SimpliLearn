
import React from 'react'
import ReactDOM from 'react-dom'
class MyComponent extends React.Component{
  constructor(){
      super();
      this.state = {
          name : "kartik",
          id :  "1"
      };
  }

  render(){
      setTimeout(() => {
         this.setState({name:"Rajpal",id:"2"}); 
      }, 2*1000);
      return(
          <div>
              <h1>Hello {this.state.name}</h1>
              <h2>ID {this.state.id}</h2>
          </div>
      );
  }
}
ReactDOM.render(<MyComponent/>,document.getElementById("root"));