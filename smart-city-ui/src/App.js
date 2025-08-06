import React from 'react';
import { BrowserRouter as Router, Routes, Route, Link } from 'react-router-dom';
import Citizens from './components/Citizens';
// Import other components here

function App() {
  return (
    <Router>
      <nav>
        <Link to="/citizens">Citizens</Link>
      </nav>
      <Routes>
        <Route path="/citizens" element={<Citizens />} />
        
      </Routes>
    </Router>
  );
}

export default App;
