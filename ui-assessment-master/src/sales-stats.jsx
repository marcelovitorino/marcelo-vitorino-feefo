import React from 'react';
import PropTypes from 'prop-types';
import styled from 'styled-components';
import { FontAwesomeIcon } from '@fortawesome/react-fontawesome';
import { faUpload } from '@fortawesome/free-solid-svg-icons';

const SalesStatsContainer = styled.div`
  margin-top: 100px; /* Adjust as needed */
`;

const SalesTable = styled.table`
    width: 100%;
    background-color: white;
    border-radius: 10px;
    box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
    border-collapse: collapse;
`;

const SalesTableRow = styled.tr`
  border-bottom: 1px solid #ccc;
`;

const SalesTableHeader = styled.th`
  text-align: left;
  padding: 10px;
`;

const SalesTableDataPercentage = styled.td`
  color: green;
  padding: 10px;
  font-size: x-large;
`;

const SalesTableData = styled.td`
  padding: 10px;
  color: darkgray;
  font-size: x-large;
`;

const UploadIcon = styled.div`
  color: blue; /* Blue color for the icon */
  font-size: 24px;
  margin-bottom: 10px;
  display: inline-block;
  margin-right: 10px;
`;

const BoldText = styled.span`
  font-weight: bold;
`;

const SalesStats = ({ salesData }) => {
  return (
    <SalesStatsContainer>
      <SalesTable>
        <tbody>
          <SalesTableRow>
            <SalesTableHeader colSpan="2">
              <UploadIcon>
                <FontAwesomeIcon icon={faUpload} />
              </UploadIcon>
              Uploads
              <SalesTableData colSpan="2">You had <BoldText>{salesData.uploads}</BoldText> uploads and <BoldText>{salesData.linesAdded}</BoldText> lines added</SalesTableData>
            </SalesTableHeader>
          </SalesTableRow>
          <SalesTableRow rowSpan="2">
            <SalesTableDataPercentage>
              <BoldText>{salesData.uploadSuccessRate}%</BoldText>
              <BoldText><SalesTableData>Upload Success</SalesTableData></BoldText>
            </SalesTableDataPercentage>
            <SalesTableDataPercentage>
              <BoldText>{salesData.linesSavedRate}%</BoldText>
              <BoldText><SalesTableData>Lines Saved</SalesTableData></BoldText>
            </SalesTableDataPercentage>
          </SalesTableRow>
        </tbody>
      </SalesTable>
    </SalesStatsContainer>
  );
};


SalesStats.propTypes = {
  salesData: PropTypes.shape({
    uploads: PropTypes.number.isRequired,
    linesAdded: PropTypes.number.isRequired,
    uploadSuccessRate: PropTypes.number.isRequired,
    linesSavedRate: PropTypes.number.isRequired,
  }).isRequired,
};

export default SalesStats;
