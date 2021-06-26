import {BrowserRouter, Switch, Route} from 'react-router-dom';
import Listarinvestimentos from '../pages/Listarinvestimentos';
import Cadastrarinvestimento from '../pages/Cadastrarinvestimento'


export default function routes(){
    return(
        <BrowserRouter>
            <Switch> 
                <Route exact path="/" component={Listarinvestimentos}/>
                <Route exact path="/cadastrar-investimento" component={Cadastrarinvestimento}/>
                <Route exact path="/listar-investimentos" component={Listarinvestimentos}/>
            </Switch>
        </BrowserRouter>
    );
}