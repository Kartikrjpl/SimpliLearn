import React from "react";
import ReactDOM from "react-dom";
class MyComponent extends React.Component {
  constructor() {
    super();
    this.state = {
      data: [
        {
          id: "1"
        },

        {
          id: "22"
        },

        {
          id: "333"
        }
      ]
    };
  }

  render() {
    return (
      <div>
        {this.state.data.map((data1) => (
          <h1>ID : {data1.id}</h1>
        ))}
      </div>
    );
  }
}
ReactDOM.render(<MyComponent />, document.getElementById("root"));
