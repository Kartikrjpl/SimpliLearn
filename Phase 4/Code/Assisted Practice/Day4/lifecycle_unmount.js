
import React from 'react';
import ReactDOM from 'react-dom';

class Componentwillunmout extends React.Component{
    constructor(props){
        super(props);
        this.state = {show:true};
    }

    render(){
        return(
            <>
            <p>{this.state.show ? <Child/> : null}</p>
            <button 
            onClick = { ()=> {
                this.setState({show:false});
            }}>
                Clicl me toggle
            </button>
            </>
        );
    }


}

class Child extends React.Component{
    Componentwillunmout(){
        alert("This will unmount");
    }
    render(){
        return <> I am child </>
    }
}

ReactDOM.render(<Componentwillunmout/>,document.getElementById('root'));

