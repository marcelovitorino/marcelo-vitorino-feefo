import React from 'react';
import styled from 'styled-components';

import FeefoSupportContact from './feefo-support-contact';
import AccountTitle from './account-title';
import SalesStats from './sales-stats';

import './account-overview.css';

const AccountOverviewContainer = styled.div`
  background-color: #f0f0f0; /* Gray background color */
  padding: 20px;
  border-radius: 10px;
  box-shadow: 0 0 10px rgba(0, 0, 0, 0.1); /* Box shadow for a subtle effect */
  width: auto;
  margin: auto;
  position: relative; /* Required for absolute positioning of title and contact */
  height: 100vh; /* Full viewport height */
`;

const Title = styled.h1`
  font-size: 24px;
  margin: 0;
  color: #333; /* Title color */
  position: absolute;
  top: 10px;
  left: 10px;
`;

const SupportContactContainer = styled.div`
  position: absolute;
  top: 10px;
  right: 10px;
`;


export const AccountOverview = ({ data }) => {
  console.log(data);

  // Sample sales data, replace it with actual data
  const salesData = {
    uploads: 100,
    linesAdded: 500,
    uploadSuccessRate: 85,
    linesSavedRate: 60,
  };

  return (
    <AccountOverviewContainer>
      <Title>Account Overview</Title>
      <SupportContactContainer>
        <FeefoSupportContact />
      </SupportContactContainer>
      <SalesStats salesData={salesData} />
    </AccountOverviewContainer>
  );
};

export default AccountOverview;
