import React from "react"
import Home from "./Home"
import Stuff from "./Stuff"
import Contact from "./Contact"
import  {Route,NavLink,HashRouter} from "react-router-dom";
import ReactDOM from 'react-dom';
import  "./styles.css"
class Main extends React.Component {
    render() {
        return (
            <HashRouter>
                <div>
                    <h1>SPA</h1>
                    <ul>
                        <li>
                            <NavLink exact to="/home">Home</NavLink>
                        </li>

                        <li>
                            <NavLink to="/stuff">Stuff</NavLink>
                        </li>

                        <li>
                            <NavLink to="/contact">Contact</NavLink>
                        </li>
                    </ul>

                    <div>
                        <Route path="/home" component={Home} />
                        <Route path="/stuff" component={Stuff} />
                        <Route path="/contact" component={Contact} />
                    </div>

                </div>
            </HashRouter>
        )
    }
}

ReactDOM.render(<Main/>,document.getElementById('root'))