import React from 'react';

import ReactDOM from 'react-dom';

class Form extends React.Component {

    constructor() {
        super();
        this.state = {
            isLogin: false
        }
        this.setLogin = this.setLogin.bind(this)
        this.setSignup = this.setSignup.bind(this)
    }

    setLogin() {
        this.setState({
            isLogin: true
        })
    }

    setSignup() {
        this.setState({
            isLogin: false
        })
    }

    render() {

        let page;
        if (this.state.isLogin) {
            page = <div><h3>Login Form</h3>
            <pre>

            <label>Username       </label>
            <input type = "text" required value = {this.state.username} ></input>
            <br></br>          
            <label>Password       </label>
            <input type = "number" required value = {this.state.password} ></input>
            <br></br>
            <br></br>
            <br></br>
            
            <button>Submit</button>
            </pre>
            
            </div>
            
        } else {
            page = 
            <div><h3>Signup Form</h3>
            <pre>
            <label>First Name          </label>
            
            <input type = "text" required value = {this.state.name} ></input>
            <br></br>
            <label>Last Name           </label>
            
            <input type = "text" required value = {this.state.name} ></input>
            <br></br>

            <label>Username            </label>
            <input type = "text" required value = {this.state.username} ></input>
            <br></br>          
            <label>Password            </label>
            <input type = "text" required value = {this.state.password} ></input>
            <br></br>
            <label>Confirm Password    </label>
            <input type = "text" required value = {this.state.password} ></input>
            <br></br>
            
            <br></br>
            <br></br>
            
            <button>Submit</button>
            </pre>
            
            </div>
        }

        return (
            <div>
                <div>
                    <button onClick={this.setLogin}>Login</button>
                    <button onClick={this.setSignup}>Signup</button>
                </div>
                    {page}
                <div>
                
                </div>
            </div>
        )
    }
}



ReactDOM.render(<Form/>, document.getElementById('root'));