import React, { useEffect, useState } from 'react';
import axios from 'axios';

const Citizens = () => {
  const [citizens, setCitizens] = useState([]);

  useEffect(() => {
    axios.get('http://localhost:8080/api/citizens')
      .then(response => setCitizens(response.data))
      .catch(error => console.error('Error fetching citizens:', error));
  }, []);

  return (
    <div>
      <h2>All Registered Citizens</h2>
      <table border="1" cellPadding="10">
        <thead>
          <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Contact Info</th>
          </tr>
        </thead>
        <tbody>
          {citizens.map(citizen => (
            <tr key={citizen.citizenID}>
              <td>{citizen.citizenID}</td>
              <td>{citizen.name}</td>
              <td>{citizen.contactInfo}</td>
            </tr>
          ))}
        </tbody>
      </table>
    </div>
  );
};

export default Citizens;
