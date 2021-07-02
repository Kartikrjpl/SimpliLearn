import React from 'react';
import ReactDOM from 'react-dom';
class Music extends React.Component{
    constructor(){
        super();
        this.state ={Instrument: "Guitar"};
    }
    shouldComponentUpdate(){
        return false;
    }
    change = () => {
        this.setState({Instrument:"Drums"});
    }

    render() {
        return(
            <div>
                <h1>I know how to play {this.state.Instrument}</h1>
                <button type="button" onClick = {this.change}>
                    Change Instrument
                </button>
            </div>
        );
    }
}

ReactDOM.render(<Music />, document.getElementById('root'))