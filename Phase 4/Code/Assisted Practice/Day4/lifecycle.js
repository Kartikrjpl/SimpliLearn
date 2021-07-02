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
    };

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



class Music extends React.Component{
    constructor(props){
        super(props);
        this.state ={Instrument: "Guitar"};
    }
    componentDidMount(){
        setTimeout(() => {this.setState({Instrument:"Drums"})},2000)
    }
    getSnapshotBeforeUpdate(prevProps,prevState){
        document.getElementById("CON1").innerHTML = "Before the update the instrument waas " +prevState.Instrument;
    }
    componentDidUpdate(){
        document.getElementById("CON2").innerHTML = "The updated instrument is "+this.state.Instrument;
    }
    render(){
        return(
            <div>
                <h1>I know how to play {this.state.Instrument}</h1>
                <div id = "CON1"> </div>
                <div id = "CON2"> </div>
                
            </div>
        );
    }
}

ReactDOM.render(<Music />, document.getElementById('root'))



class Music extends React.Component{
    constructor(props){
        super(props);
        this.state ={Instrument: "Guitar"};
    }
    componentDidMount(){
        setTimeout(() => {this.setState({Instrument:"Drums"})},2000)
    }
    componentDidUpdate(){
        document.getElementById("CON").innerHTML = "The updated instrument is "+this.state.Instrument;
    }
    render(){
        return(
            <div>
                <h1>I know how to play {this.state.Instrument}</h1>
                <div id = "CON"> </div>
                
            </div>
        );
    }
}

ReactDOM.render(<Music />, document.getElementById('root'))

