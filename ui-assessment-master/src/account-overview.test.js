import React from 'react';
import { render, screen } from '@testing-library/react';
import '@testing-library/jest-dom/extend-expect'; // For additional matchers
import AccountOverview from './account-overview';

describe('AccountOverview component', () => {
  test('renders Feefo support contact', () => {
    // Render the component
    render(<AccountOverview />);

    // Check if Feefo support contact is rendered
    expect(screen.getByText('YOUR FEEFO SUPPORT CONTACT')).toBeInTheDocument();
    expect(screen.getByText('Support')).toBeInTheDocument();
    expect(screen.getByText('support@feefo.com')).toBeInTheDocument();
    expect(screen.getByText('020 3362 4208')).toBeInTheDocument();
  });
});