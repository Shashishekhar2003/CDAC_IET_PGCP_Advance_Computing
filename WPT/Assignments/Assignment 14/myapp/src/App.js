import logo from './logo.svg';
import './App.css';
import Ispalindrome from './isPalindrome';
import Data from './inputBtn';
import Addition from './add';
import Substraction from './sub';

function App() {
  return (
    // <div className="App">
    //   {/* <header className="App-header">
    //     <img src={logo} className="App-logo" alt="logo" />
    //     <p>
    //       Edit <code>src/App.js</code> and save to reload.
    //     </p>
    //     <a
    //       className="App-link"
    //       href="https://reactjs.org"
    //       target="_blank"
    //       rel="noopener noreferrer"
    //     >
    //       Learn React
    //     </a>
    //   </header> */}
      
    // </div>

    <div>
      <Ispalindrome></Ispalindrome>
      <Data></Data>
      <Addition></Addition>
      <Substraction></Substraction>
    </div>
  );
}

export default App;
