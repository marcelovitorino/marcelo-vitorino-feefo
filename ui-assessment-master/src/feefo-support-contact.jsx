import React from 'react';
import { FontAwesomeIcon } from '@fortawesome/react-fontawesome';
import { faEnvelope, faPhone } from '@fortawesome/free-solid-svg-icons';
import './feefo-support-contact.css'; // Import the CSS file

const FeefoSupportContact = () => {
  return (
    <div className="FeefoSupportContainer">
      <div className="FeefoSupportTextTitle">YOUR FEEFO SUPPORT CONTACT</div>
      <div className="FeefoSupportText">Support</div>
      <div className="ContactRow">
        <FontAwesomeIcon icon={faEnvelope} style={{ marginRight: '5px' }} />
        <div>support@feefo.com</div>
      </div>
      <div className="ContactRow">
        <FontAwesomeIcon icon={faPhone} style={{ marginRight: '5px' }} />
        <div>020 3362 4208</div>
      </div>
    </div>
  );
};

export default FeefoSupportContact;
